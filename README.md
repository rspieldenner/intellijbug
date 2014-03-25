IntelliJ 13.0.2, 13.1.1 Gradle Import Issue
===========================================

I believe this import issue is being caused when gradle buildscript plugins are pulled from a maven repository when they interact with project dependencies being pulled from an ivy repository, with a library available in both repositories.

The exampleplugin depends on com.netflix.frigga:frigga:0.6 via a local maven repository. The source code of the project pulls dependencies from a local ivy repository that happens to contain the frigga library as well.

idea.log from the import is committed to this repository

## IntelliJ and JDK Versions

IntelliJ Ultimate 13.1.1, build 135.480
running on Mac OS X 10.9.2
on JRE 1.6.0_65-b14-462-11M4609 x86_64

Default Project SDK set as Oracle JDK 1.7.0_51