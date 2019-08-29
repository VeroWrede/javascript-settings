package JavaScript.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*

object JavaScript_02IE : BuildType({
    template(JavaScript.buildTypes.JavaScript_Template)
    uuid = "unique_never_to_change_javascriptIE"
    extId = "JavaScript_02IE"
    name = "02. Internet Explorer"

    params {
        param("Browser", "IE")
    }

    dependencies {
        dependency(JavaScript.buildTypes.JavaScript_01FastTests) {
            snapshot {
            }
        }
    }
})
