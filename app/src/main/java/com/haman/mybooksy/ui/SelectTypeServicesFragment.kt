package com.haman.mybooksy.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.haman.mybooksy.R

class SelectTypeServicesFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_select_type_services, container, false)
    }

    companion object {
        @JvmStatic
        fun newInstance() = SelectTypeServicesFragment()
    }
}
