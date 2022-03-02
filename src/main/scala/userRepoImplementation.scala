import scala.collection.mutable.ListBuffer

class userRepoImplementation extends UserRepo {

  val userList = ListBuffer.empty[String]
  override def insert(user: User): Unit=userList.append(user.name)
  override def getUser(name: String)= userList.filter(_.contains(name)).mkString("\n")

  override def getAll: String = userList.mkString("\n")

  override def deleteUser(name: String): Unit = userList.remove(userList.indexOf(name))

}