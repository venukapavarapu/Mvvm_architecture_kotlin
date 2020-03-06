package com.venu.mvvm_architecture_kotlin.data.room.entities

import androidx.annotation.NonNull
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName


@Entity(tableName = "versions")
data class Versions(
    @PrimaryKey
    @NonNull
    @field:SerializedName("id")
    val id: Int,

    @NonNull
    @field:SerializedName("name")
    val name: String,

    @NonNull
    @field:SerializedName("apiLevel")
    val apiLevel: String
){
//[Android(name=Cupcake, version=1.5, apiLevel=API level 3), Android(name=Donut, version=1.6, apiLevel=API level 4), Android(name=Eclair, version=2.0 - 2.1, apiLevel=API level 5 - 7), Android(name=Froyo, version=2.2, apiLevel=API level 8), Android(name=Gingerbread, version=2.3, apiLevel=API level 9 - 10), Android(name=Honeycomb, version=3.0 - 3.2, apiLevel=API level 11 - 13), Android(name=Ice Cream Sandwich, version=4.0, apiLevel=API level 14 - 15), Android(name=JellyBean, version=4.1 - 4.3, apiLevel=API level 16 - 18), Android(name=KitKat, version=4.4, apiLevel=API level 19), Android(name=Lollipop, version=5.0 - 5.1, apiLevel=API level 21 - 22), Android(name=Marshmallow, version=6.0, apiLevel=API level 23), Android(name=Nougat, version=7.0 - 7.1, apiLevel=API level 24 - 25), Android(name=Oreo, version=8.0 - 8.1, apiLevel=API level 26 - 27)]
}