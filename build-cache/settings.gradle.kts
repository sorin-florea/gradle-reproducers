plugins {
    id("com.gradle.develocity") version "3.17.2"
}

rootProject.name = "build-cache"


buildCache {
    local {
        isEnabled = false
        isPush = false
    }
    remote(develocity.buildCache) {
        isEnabled = true
        server = "https://ge.gradle.org/"
    }
}

