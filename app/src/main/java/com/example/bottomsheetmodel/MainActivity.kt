package com.example.bottomsheetmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.example.bottomsheetmodel.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity()
{
    private lateinit var binding: ActivityMainBinding
    private lateinit var taskViewModel: TaskVeiewModel

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        taskViewModel = ViewModelProvider(this).get(TaskVeiewModel::class.java)
        binding.NewTaskButton.setOnClickListener {
            NewTaskSheet().show(supportFragmentManager, "newTaskTag")
        }

        taskViewModel.name.observe(this){
            binding.taskName.text = String.format("Task Name: %s", it)
        }
        taskViewModel.desc.observe(this){
            binding.taskDescription.text = String.format("Task Desc: %s", it)
        }
    }
}