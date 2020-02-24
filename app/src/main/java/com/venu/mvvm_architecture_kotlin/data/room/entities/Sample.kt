package com.venu.mvvm_architecture_kotlin.data.room.entities

import androidx.room.Entity
import com.google.gson.annotations.SerializedName


@Entity(primaryKeys = ["id"])
class Sample(
    @field:SerializedName("id")
    val id: String,
    @field:SerializedName("name")
    val name: String?
)