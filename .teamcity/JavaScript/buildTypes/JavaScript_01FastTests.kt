package JavaScript.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*

object JavaScript_01FastTests : BuildType({
    template(JavaScript.buildTypes.JavaScript_Template)
    uuid = "d01d7375-f3a5-4d28-8f42-c0d33c831753"
    extId = "JavaScript_01FastTests"
    name = "01.Fast Tests"

    params {
        param("Browser", "PhantomJS")
    }
})
