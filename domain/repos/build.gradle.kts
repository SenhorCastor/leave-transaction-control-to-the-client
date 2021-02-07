group = "io.domain.repos"

tasks.getByName<Jar>("jar") {
    archiveBaseName.set("io.domain.repos")
}

dependencies {
    implementation(Dependencies.mongo.kMongo)

    implementation(project(":domain:entities"))
    implementation(project(":domain:usecases"))

    implementation(project(":transaction:interface"))
    implementation(project(":transaction:mongo"))
}
