package com.ema.emaaprende.todoapp

data class Task (val name:String, val category: TaskCategory, var isSelected:Boolean = false)