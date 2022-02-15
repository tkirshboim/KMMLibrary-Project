pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
        mavenCentral()
    }
}

rootProject.name = "KMMMainProject"
include(":androidApp")
include(":shared")
include("lib")
project(":lib").projectDir = file("kmmLibraryProject/lib")
include("kmmLibraryProject:androidApp")
