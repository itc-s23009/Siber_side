package jp.ac.it_college.std.s23009.practice.chap2

class DelegatePerson {
    var name: String by DelegateWithMessage()
    var address: String by DelegateWithMessage()
}