trait UserRepo {
  def insert(name:User): Unit
  def getUser(name: String): String
  def getAll: String
  def deleteUser(name: String)

}