

open class CLassA : ClassB(), callback {
    override fun abbd() {
        println("Interface calling...")
    }

    init {
        print("init is calling\n")
    }

    override fun abc() {
        print("abc derived class B\n")
    }

    fun sample () {
        print("Class A is calling...\n")
    }
}
