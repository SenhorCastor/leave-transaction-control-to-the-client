group = "io.domain.usecases"

tasks.getByName<Jar>("jar") {
    archiveBaseName.set("io.domain.usecases")
}

dependencies {
    implementation(project(":transaction:interface"))
    implementation(project(":domain:entities"))

}
