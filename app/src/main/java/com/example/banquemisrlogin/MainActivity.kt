package com.example.banquemisrlogin

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.banquemisrlogin.ui.theme.BanqueMisrLoginTheme
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.runtime.*
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BanqueMisrLoginTheme {

            }
        }
    }
}

@Composable
fun BanqueMisrLogin (){

    var username by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }


    val buttonAlpha = if (username.isNotEmpty() && password.isNotEmpty()) 1f else 0.4f

    val scrollState = rememberScrollState()


    Column ( modifier = Modifier
        .fillMaxHeight(6f)
        .verticalScroll(scrollState))
    {

        Row (modifier = Modifier.fillMaxWidth()){
            Image(painter = painterResource(id = R.drawable.bm_icon),
                contentDescription = "Banque Misr Logo",
                modifier = Modifier.padding(top = 40.dp , start = 16.dp))
            Text(text = stringResource(id = R.string.language),
                modifier = Modifier.padding(top = 50.dp , start = 165.dp),
                color = colorResource(id = R.color.Red),
                fontSize = 23.sp,
                fontWeight = FontWeight.Bold
                )


        }

        OutlinedTextField(
            value = username,
            onValueChange = { newText -> username = newText },
            label = { Text(text = stringResource(id = R.string.username) ,
                Modifier.alpha(0.6f),
                    color = colorResource(id =  R.color.Gray))},
            modifier = Modifier
                .size(350.dp, 110.dp)
                .padding(top = 40.dp, start = 30.dp)
        )


        OutlinedTextField(
            value = password,
            onValueChange = { newText -> password = newText },
            label = { Text(text = stringResource(id = R.string.password) ,
                Modifier.alpha(0.6f),
                color = colorResource(id =  R.color.Gray),
                textAlign = TextAlign.Start)},
            modifier = Modifier
                .size(350.dp, 100.dp)
                .padding(top = 30.dp, start = 30.dp),
            visualTransformation = PasswordVisualTransformation(),
            trailingIcon = {
                Icon(
                    painter = painterResource(id = R.drawable.baseline_disabled_visible_24),
                    contentDescription = "Password isn't visible",
                )
            }

        )

        Text(text = stringResource(id = R.string.forgot),
            modifier = Modifier.padding(top = 30.dp , start = 30.dp),
            color = colorResource(id = R.color.Gray),
            fontSize = 15.sp,
            textDecoration = TextDecoration.Underline
        )

        Button(onClick = { /*TODO*/ },
            modifier = Modifier
                .padding(start = 20.dp, top = 40.dp)
                .size(width = 350.dp, height = 60.dp)
                .alpha(buttonAlpha),
            shape = RoundedCornerShape(10.dp),
            colors = ButtonDefaults.buttonColors(colorResource(id = R.color.Marron))
            ) {
            Text(text = stringResource(id = R.string.login),
            fontSize = 18.sp)
            
        }

        Row {
            Text(text = stringResource(id = R.string.help),
                modifier = Modifier.padding(top =25.dp , start = 30.dp),
                color = colorResource(id = R.color.black),
                fontSize = 15.sp,
            )
            Text(text = stringResource(id = R.string.contact),
                modifier = Modifier.padding(top =25.dp , start = 5.dp),
                color = colorResource(id = R.color.Red),
                fontSize = 15.sp,
                fontWeight = FontWeight.Bold,
                textDecoration = TextDecoration.Underline

            )

        }

        Divider(
            modifier = Modifier
                .padding(vertical = 35.dp)
                .width(370.dp)
                .padding(start = 20.dp, top = 20.dp,)
                .alpha(0.3f),
            color = colorResource(id = R.color.Gray),
            thickness = 2.dp
        )

        Row {
            Column {
                Image(painter = painterResource(R.drawable.our_products),
                    contentDescription = "Our products",
                    modifier = Modifier
                        .offset(x = 35.dp, y = (-10).dp)
                        .size(60.dp))
                Text(text = stringResource(id = R.string.prod),
                    modifier = Modifier.padding(start = 32.dp),
                    fontSize = 12.sp)

            }

            Column (modifier = Modifier.fillMaxWidth(0.3f)){
                Image(painter = painterResource(R.drawable.exchange_rate),
                    contentDescription = "Our products",
                    modifier = Modifier
                        .offset(x = 19.dp, y = (-10).dp)
                        .size(60.dp))
                Text(text = stringResource(id = R.string.rate),
                    modifier = Modifier.padding(start = 25.dp, bottom = 90.dp),
                    fontSize = 12.sp,
                    textAlign = TextAlign.Center,
                    )

            }


            Column {
                Image(painter = painterResource(R.drawable.security_tips),
                    contentDescription = "Our products",
                    modifier = Modifier
                        .offset(x = 25.dp, y = (-10).dp)
                        .size(60.dp))
                Text(text = stringResource(id = R.string.tips),
                    modifier = Modifier.padding(start = 23.dp),
                    fontSize = 12.sp)

            }


            Column (modifier = Modifier.fillMaxWidth(0.8f)){
                Image(painter = painterResource(R.drawable.nearest_branch_or_atm),
                    contentDescription = "Our products",
                    modifier = Modifier
                        .offset(x = 28.dp, y = (-10).dp)
                        .size(60.dp))
                Text(text = stringResource(id = R.string.branches),
                    modifier = Modifier
                        .padding(start = 27.dp, bottom = 90.dp),
                    fontSize = 12.sp,
                    textAlign = TextAlign.Center


                    )

            }


        }






    }
    

}

@Preview(showSystemUi = true)
@Composable
fun BanqueMisrLoginPreview () {

    BanqueMisrLogin()

}