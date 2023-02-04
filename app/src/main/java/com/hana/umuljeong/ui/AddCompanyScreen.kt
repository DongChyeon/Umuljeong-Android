package com.hana.umuljeong.ui

import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.hana.umuljeong.R
import com.hana.umuljeong.ui.component.UButton
import com.hana.umuljeong.ui.component.UTextField
import com.hana.umuljeong.ui.theme.UmuljeongTheme

@Composable
fun AddCompanyScreen(
    modifier: Modifier = Modifier,
    confirmBtnOnClick: () -> Unit
) {
    Column(
        modifier = modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Column(
            modifier = Modifier.weight(1f)
        ) {
            Spacer(modifier = Modifier.height(40.dp))

            Text(
                text = stringResource(id = R.string.add_company_info_two),
                style = TextStyle(
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 24.sp
                )
            )

            Spacer(modifier = Modifier.height(30.dp))

            Row {
                Text(
                    text = stringResource(id = R.string.company_name),
                    style = TextStyle(
                        fontWeight = FontWeight.Normal,
                        fontSize = 14.sp
                    )
                )
                Text(
                    text = stringResource(id = R.string.star),
                    style = TextStyle(
                        fontWeight = FontWeight.Normal,
                        color = Color.Red,
                        fontSize = 14.sp
                    )
                )
            }

            Spacer(Modifier.height(6.dp))

            var companyName by remember { mutableStateOf("") }
            UTextField(
                modifier = Modifier.width(335.dp),
                msgContent = companyName,
                hint = stringResource(id = R.string.company_name_hint),
                onValueChange = { companyName = it })

            Spacer(modifier = Modifier.height(26.dp))

            Row {
                Text(
                    text = stringResource(id = R.string.leader_name),
                    style = TextStyle(
                        fontWeight = FontWeight.Normal,
                        fontSize = 14.sp
                    )
                )
                Text(
                    text = stringResource(id = R.string.star),
                    style = TextStyle(
                        fontWeight = FontWeight.Normal,
                        color = Color.Red,
                        fontSize = 14.sp
                    )
                )
            }

            Spacer(Modifier.height(6.dp))

            var leaderName by remember { mutableStateOf("") }
            UTextField(
                modifier = Modifier.width(335.dp),
                msgContent = leaderName,
                hint = stringResource(id = R.string.leader_name_hint),
                onValueChange = { leaderName = it })

            Spacer(modifier = Modifier.height(26.dp))
        }


        Column {
            UButton(
                modifier = Modifier.width(335.dp),
                onClick = confirmBtnOnClick
            ) {
                Text(
                    text = stringResource(id = R.string.confirm)
                )
            }

            Spacer(Modifier.height(42.dp))
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewAddCompanyScreen() {
    UmuljeongTheme {
        AddCompanyScreen {

        }
    }
}