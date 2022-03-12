package id.ghodel.theme

import android.content.res.Configuration
import android.os.Bundle
import android.telecom.Conference
import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import id.ghodel.theme.databinding.FragmentMaterialTextInputDemoBinding

class MaterialTextInputDemoFragment : Fragment() {

    private lateinit var mBinding: FragmentMaterialTextInputDemoBinding

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        mBinding = FragmentMaterialTextInputDemoBinding.inflate(layoutInflater, container, false)
        return mBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        
        mBinding.apply {
            inputThree.addOnEndIconChangedListener { textInputLayout, previousIcon ->

            }

            inputPassword.addTextChangedListener(object : TextWatcher {
                override fun afterTextChanged(p0: Editable?) {
                    mBinding.inputThree.error = null
                }

                override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

                }

                override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

                }
            })
        }
    }

    companion object {

        @JvmStatic
        fun newInstance(): MaterialTextInputDemoFragment {
            return MaterialTextInputDemoFragment()
        }
    }
}