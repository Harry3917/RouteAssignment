class UserService (userRepo: UserRepo){
  def getUser(id:String)= userRepo.getUser(id)
  def insert(str:User): Unit= userRepo.insert(str)
  def getAllUser: String= userRepo.getAll
  def deleteUser(name: String): Unit= userRepo.deleteUser(name)
}