import annotation.tailrec

object cryptoWorksheet {
  // let's start with something easy
  //define a gcd and lcm function for BigInts

  //@tailrec
  def gcd(a: BigInt, b: BigInt): BigInt = {
    if (b == 0) a
    else gcd(b, a % b)
  }                                               //> gcd: (a: BigInt, b: BigInt)BigInt

  def lcm(a: BigInt, b: BigInt): BigInt = if (a == 0 || b == 0) 0 else (a.abs / gcd(a, b)) * b.abs
                                                  //> lcm: (a: BigInt, b: BigInt)BigInt

  //tests
  gcd(14, 21)                                     //> res0: BigInt = 7
  gcd(21, 14)                                     //> res1: BigInt = 7
  gcd(2, 3)                                       //> res2: BigInt = 1
  gcd(10, 10)                                     //> res3: BigInt = 10
  gcd(0, 4)                                       //> res4: BigInt = 4
  gcd(2185, 2025)                                 //> res5: BigInt = 5

  lcm(21, 6)                                      //> res6: BigInt = 42
  lcm(6, 21)                                      //> res7: BigInt = 42
  lcm(2, 3)                                       //> res8: BigInt = 6
  lcm(10, 18)                                     //> res9: BigInt = 90
  lcm(0, 3)                                       //> res10: BigInt = 0
  lcm(3, 0)                                       //> res11: BigInt = 0
  lcm(3, 3)                                       //> res12: BigInt = 3
  lcm(0, 0)                                       //> res13: BigInt = 0
}