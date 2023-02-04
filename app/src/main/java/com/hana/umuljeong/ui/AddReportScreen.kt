package com.hana.umuljeong.ui

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.hana.umuljeong.R
import com.hana.umuljeong.data.datasource.fakeBussinessData
import com.hana.umuljeong.data.datasource.fakeCategoryData
import com.hana.umuljeong.getCurrentTime
import com.hana.umuljeong.ui.component.*
import com.hana.umuljeong.ui.theme.FontDarkGray
import com.hana.umuljeong.ui.theme.UmuljeongTheme

@Composable
fun AddReportScreen(
    modifier: Modifier = Modifier,
    addPhotoBtnOnClick: () -> Unit,
    addBtnOnClick: () -> Unit
) {
    Column(
        modifier = modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Column(
            modifier = Modifier
                .verticalScroll(rememberScrollState())
                .weight(1f)
        ) {
            Spacer(modifier = Modifier.height(40.dp))

            Column(
                verticalArrangement = Arrangement.spacedBy(10.dp)
            ) {
                UTextFieldWithTitle(
                    modifier = Modifier.width(335.dp),
                    msgContent = "황진화",
                    readOnly = true,
                    title = stringResource(id = R.string.author)
                )

                var selectedBusiness by remember { mutableStateOf("") }
                UDropDownMenu(
                    modifier = Modifier.width(335.dp),
                    title = stringResource(id = R.string.business_name),
                    options = fakeBussinessData,
                    selectedOption = selectedBusiness,
                    optionOnClick = { selectedBusiness = it }
                )

                var selectedCategory by remember { mutableStateOf("") }
                UDropDownMenu(
                    modifier = Modifier.width(335.dp),
                    title = stringResource(id = R.string.work_category),
                    options = fakeCategoryData,
                    selectedOption = selectedCategory,
                    optionOnClick = { selectedCategory = it }
                )

                UTextFieldWithTitle(
                    modifier = Modifier.width(335.dp),
                    msgContent = getCurrentTime(),
                    readOnly = true,
                    title = stringResource(id = R.string.work_date)
                )

                var content by remember { mutableStateOf("") }
                UTextField(
                    modifier = Modifier
                        .width(335.dp)
                        .heightIn(min = 260.dp, max = Dp.Infinity),
                    textStyle = TextStyle(
                        color = FontDarkGray,
                        fontSize = 16.sp
                    ),
                    msgContent = content,
                    hint = stringResource(id = R.string.report_content_hint),
                    singleLine = false,
                    onValueChange = { content = it }
                )

                UAddButton(
                    onClick = addPhotoBtnOnClick,
                    text = stringResource(id = R.string.add_photo),
                    modifier = Modifier.width(335.dp)
                )

                Spacer(Modifier.height(8.dp))
            }
        }

        Column {
            UButton(
                modifier = Modifier.width(335.dp),
                onClick = addBtnOnClick
            ) {
                Text(
                    text = stringResource(id = R.string.complete)
                )
            }

            Spacer(Modifier.height(42.dp))
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewAddReportScreen() {
    UmuljeongTheme {
        AddReportScreen(
            addPhotoBtnOnClick = { },
            addBtnOnClick = { }
        )
    }
}