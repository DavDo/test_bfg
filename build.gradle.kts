// Top-level build file where you can add configuration options common to all sub-projects/modules.
import org.jetbrains.dokka.gradle.DokkaTask
plugins {
    id("com.android.application") version "7.1.3" apply false
    id("com.android.library") version "7.1.3" apply false
    id("org.jetbrains.kotlin.android") version "1.6.20" apply false
    id("org.jetbrains.dokka") version "1.6.10" apply false
}

tasks {
    register("clean", Delete::class) {
        delete(rootProject.buildDir)
    }
}

tasks.withType<DokkaTask>().configureEach {  }