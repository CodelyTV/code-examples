object UserNameMother {
  private val minimumChars = 1
  private val maximumChars = 20

  def apply(value: String): UserName = UserName(value)

  def random: UserName = UserName(
    StringMother.random(numChars = IntMother.randomBetween(minimumChars, maximumChars))
  )
}
