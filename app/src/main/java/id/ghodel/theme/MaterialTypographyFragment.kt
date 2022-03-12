package id.ghodel.theme

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import id.ghodel.theme.databinding.FragmentMaterialTypographyDemoBinding

class MaterialTypographyFragment : Fragment() {

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        return FragmentMaterialTypographyDemoBinding.inflate(layoutInflater, container, false).root
    }

    companion object {

        @JvmStatic
        fun newInstance(): MaterialTypographyFragment {
            return MaterialTypographyFragment()
        }
    }
}