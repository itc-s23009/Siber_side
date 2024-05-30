package jp.ac.it_college.std.nakasone.practice.chap2

class DelegatePerson {
    var name: String by DelegateWithMessage()
    var address: String by DelegateWithMessage()
}