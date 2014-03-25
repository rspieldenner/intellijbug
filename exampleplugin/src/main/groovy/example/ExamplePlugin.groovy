package example

import org.gradle.api.Project
import org.gradle.api.Plugin
//import com.netflix.wrapper.FriggaWrapper
import com.netflix.frigga.NameConstants 

class ExamplePlugin implements Plugin<Project> {
    @Override
    void apply(Project project) {
        println NameConstants.NAME_CHARS
        //println new FriggaWrapper().wrapField()
    }
}
