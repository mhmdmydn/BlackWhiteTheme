package id.ghodel.theme

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import id.ghodel.theme.databinding.FragmentBottomSheetBinding

class MaterialRoundedBottomSheetFragment : BottomSheetDialogFragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return FragmentBottomSheetBinding.inflate(layoutInflater, container, false).root
    }

    override fun getTheme(): Int {
        return R.style.App_Theme_BottomSheet_Rounded
    }

    companion object {
        const val FRAGMENT_TAG = "bottom_sheet_rounded_fragment_tag"

        fun newInstance(): BottomSheetDialogFragment{
            return MaterialRoundedBottomSheetFragment()
        }
    }
}