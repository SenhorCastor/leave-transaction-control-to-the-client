group = "io.usecases"

tasks.getByName<Jar>("jar") {
    archiveBaseName.set("io.usecases")
}

dependencies {
    implementation(project(":entities"))
}
