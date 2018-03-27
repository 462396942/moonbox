package moonbox.core.catalog

case class CatalogSession(
	userId: Long,
	var userName: String,
	var databaseId: Long,
	var databaseName: String,
	var organizationId: Long,
	var organizationName: String
)


