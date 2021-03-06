package com.mybaseprojectandroid.ui.examples.firebase

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.mybaseprojectandroid.R
import com.mybaseprojectandroid.databinding.ExamplesFirebaseFragmentBinding
import com.mybaseprojectandroid.utils.other.FactoryViewModel

class ExamplesFirebaseFragment : Fragment(R.layout.examples_firebase_fragment) {

    private val viewModel: ExamplesFirebaseViewModel by viewModels {
        FactoryViewModel(ExamplesFirebaseViewModel())
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val binding = ExamplesFirebaseFragmentBinding.bind(view)
        binding.viewModel = viewModel
    }

}