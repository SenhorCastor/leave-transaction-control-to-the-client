object Kotlin {
    object Versions {
        const val kotlin = "1.4.20"
        const val coroutines = "1.4.2"
    }

    val versions = Versions
    const val standardLibrary = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.kotlin}"
    const val coroutinesCore = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutines}"
    const val coroutinesJDK8 = "org.jetbrains.kotlinx:kotlinx-coroutines-jdk8:${Versions.coroutines}"
    const val coroutinesReactors = "org.jetbrains.kotlinx:kotlinx-coroutines-reactor:${Versions.coroutines}"
    const val serialization = "org.jetbrains.kotlinx:kotlinx-serialization-json:1.0.1"
    const val slf4j = "org.jetbrains.kotlinx:kotlinx-coroutines-slf4j:${Versions.coroutines}"


}