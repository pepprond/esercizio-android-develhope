package com.example.esercizio_develhope.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import com.example.esercizio_develhope.R


class FirstFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false)
    }
    private lateinit var screenTextView: TextView
    private lateinit var button1: Button
    private lateinit var button2: Button
    private lateinit var button3: Button

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        initComponent(view)
        setListener()
    }

    fun initComponent(view: View){
        screenTextView =view.findViewById<TextView>(R.id.Schermo)
        button1 =view.findViewById<Button>(R.id.button1)
        button2 =view.findViewById<Button>(R.id.button2)
        button3 =view.findViewById<Button>(R.id.button3)

    }

    fun setListener(){
        val viewList = listOf<View>(button1,button2,button3)
        for (item in viewList){
            item.setOnClickListener{
                buttonReaction(it)
            }
        }
    }
fun buttonReaction(it: View){
    screenTextView.visibility =View.VISIBLE
    when(it.id){
        R.id.button1 -> screenTextView.text ="complimenti hai cliccato il bottone 1"
        R.id.button2 -> screenTextView.text ="complimenti hai cliccato il bottone 2"
        R.id.button3 -> screenTextView.text ="complimenti hai cliccato il bottone 3"
    }
}
}