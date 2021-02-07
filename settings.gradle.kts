/** App **/
//include(":app")

/** Domain **/
include(":domain:entities")
include(":domain:usecases")
include(":domain:repos")

include(":transaction:interface")
include(":transaction:mongo")

rootProject.name = "leave-transaction-control-to-the-client"
