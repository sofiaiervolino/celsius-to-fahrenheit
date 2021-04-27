package com.technibyte.celsiustofahrenheit_smartconv.ui.mathBehind

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.technibyte.celsiustofahrenheit_smartconv.R

class MathBehindFragment : Fragment() {

    private lateinit var mathBehindViewModel: MathBehindViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        mathBehindViewModel =
                ViewModelProvider(this).get(MathBehindViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_math_behind, container, false)
        val textView: TextView = root.findViewById(R.id.text_gallery)
        mathBehindViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}