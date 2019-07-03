package dev.eastar.phonenumberedittext

import android.content.Context
import android.util.AttributeSet

import androidx.appcompat.widget.AppCompatEditText

class PhoneNumberEditText : AppCompatEditText {

    var phoneNumber: String
        get() = text!!.toString().replace("\\D".toRegex(), "")
        set(phoneNumber) = setText(phoneNumber.replace("(010)(\\d{0,4})(\\d+)".toRegex(), "$1-$2-$3"))

    constructor(context: Context) : super(context) {
        init()
    }

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {
        init()
    }

    constructor(context: Context, attrs: AttributeSet, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {
        init()
    }

    private fun init() {
        this.setText(phoneNumber)
    }
}
