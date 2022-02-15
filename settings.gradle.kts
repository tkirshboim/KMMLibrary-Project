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

// declare lib as ':kmmLibraryProject:lib' - used in main
include("kmmLibraryProject:lib")
project(":kmmLibraryProject:lib").projectDir = file("kmmLibraryProject/lib")

// declare lib as ':lib', used in 'kmmLibraryProject:androidApp'
include("lib")
project(":lib").projectDir = file("kmmLibraryProject/lib")

include("kmmLibraryProject:androidApp")
