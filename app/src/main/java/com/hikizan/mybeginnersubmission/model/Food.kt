package com.hikizan.mybeginnersubmission.model

import android.os.Parcel
import android.os.Parcelable

data class Food(var name: String = "",
                var detail: String = "",
                var photo: Int = 0,
                var idr: String = "",
                var stock: String = "") : Parcelable {


    constructor(parcel: Parcel) : this() {
        name = parcel.readString().toString()
        detail = parcel.readString().toString()
        photo = parcel.readInt()
        idr = parcel.readString().toString()
        stock = parcel.readString().toString()
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(name)
        parcel.writeString(detail)
        parcel.writeInt(photo)
        parcel.writeString(idr)
        parcel.writeString(stock)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Food> {
        override fun createFromParcel(parcel: Parcel): Food {
            return Food(parcel)
        }

        override fun newArray(size: Int): Array<Food?> {
            return arrayOfNulls(size)
        }
    }
}