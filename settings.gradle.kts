pluginManagement {
    repositories {
        google()  // Google repository for Firebase and Android plugins
        mavenCentral()  // Maven Central for other dependencies
        gradlePluginPortal()  // Gradle Plugin Portal for plugins
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)  // Enforce project-level repository management
    repositories {
        google()  // Google repository for Firebase dependencies
        mavenCentral()  // Maven Central for other dependencies
    }
}

rootProject.name = "CardGaurd"
include(":app")  // Include the app module as the only subproject
