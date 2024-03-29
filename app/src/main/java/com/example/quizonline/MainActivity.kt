package com.example.quizonline

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.quizonline.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    lateinit var quizModelList: MutableList<QuizModel>
    lateinit var adapter:QuizListAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        quizModelList= mutableListOf()
        getDataFromFirebase()
    }
    private fun setupRecyclerView(){
    adapter= QuizListAdapter(quizModelList)
        binding.recyclerView.layoutManager=LinearLayoutManager(this)
        binding.recyclerView.adapter=adapter
    }
    private fun getDataFromFirebase(){
        quizModelList.add(QuizModel("1","Omkar","Omkar","10"))
        quizModelList.add(QuizModel("2","Legend","Omkar","10"))
        quizModelList.add(QuizModel("3","Supreme","Omkar","10"))
        setupRecyclerView()


    }
}