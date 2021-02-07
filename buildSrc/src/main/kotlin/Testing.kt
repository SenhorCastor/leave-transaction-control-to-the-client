object Testing {

    object Versions {
        const val junit = "5.7.0"
        const val kotlinTest = "3.4.2"
    }

    const val jUnitApi = "org.junit.jupiter:junit-jupiter-api:${Versions.junit}"
    const val jUnitEngine = "org.junit.jupiter:junit-jupiter-engine:${Versions.junit}"
    const val jUnitConsole = "org.junit.platform:junit-platform-console:1.7.0"
    const val mockito = "org.mockito:mockito-junit-jupiter:3.6.28"
    const val kotlinCore = "io.kotlintest:kotlintest-core:${Versions.kotlinTest}"
    const val kotlinAssertions = "io.kotlintest:kotlintest-assertions:${Versions.kotlinTest}"
    const val kotlinRunner = "io.kotlintest:kotlintest-runner-junit5:${Versions.kotlinTest}"
}