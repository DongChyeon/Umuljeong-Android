package com.hana.umuljeong.ui

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.hana.umuljeong.R
import com.hana.umuljeong.ui.component.UImageButton
import com.hana.umuljeong.ui.theme.UmuljeongTheme

@Composable
fun SelectCompanyScreen(
    modifier: Modifier = Modifier,
    joinCompanyBtnOnClick: () -> Unit,
    addCompanyBtnOnClick: () -> Unit
) {
    Box(
        modifier = modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            UImageButton(
                modifier = Modifier.size(width = 335.dp, height = 230.dp),
                imageModifier = modifier.size(width = 110.dp, height = 100.dp),
                onClick = addCompanyBtnOnClick,
                title = R.string.add_company,
                description = R.string.add_company_info_one,
                image = R.drawable.img_add_company
            )

            Spacer(modifier = Modifier.height(10.dp))

            UImageButton(
                modifier = Modifier.size(width = 335.dp, height = 230.dp),
                imageModifier = modifier.size(width = 115.dp, height = 115.dp),
                onClick = joinCompanyBtnOnClick,
                title = R.string.join_company,
                description = R.string.join_company_info,
                image = R.drawable.img_join_company
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewSelectCompanyScreen() {
    UmuljeongTheme() {
        SelectCompanyScreen(joinCompanyBtnOnClick = { /*TODO*/ }) {

        }
    }
}