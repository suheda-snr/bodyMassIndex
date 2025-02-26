package com.example.bodymassindex.ui.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.bodymassindex.R
import com.example.bodymassindex.ui.component.BmiInputField
import com.example.bodymassindex.ui.component.ResultText
import com.example.bodymassindex.ui.component.TitleText
import com.example.bodymassindex.viewmodel.BmiViewModel

@Composable
fun Bmi(viewModel: BmiViewModel = viewModel()) {
    Column {
        TitleText(stringResource(R.string.title))
        BmiInputField(
            value = viewModel.heightInput,
            onValueChange = viewModel::onHeightChange,
            label = stringResource(R.string.height)
        )
        BmiInputField(
            value = viewModel.weightInput,
            onValueChange = viewModel::onWeightChange,
            label = stringResource(R.string.weight)
        )
        ResultText(stringResource(R.string.result_text, viewModel.bmi))
    }
}