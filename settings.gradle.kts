pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}

include(":app", ":shared")
rootProject.name = "TravelApp-KMM"

enableFeaturePreview("VERSION_CATALOGS")
