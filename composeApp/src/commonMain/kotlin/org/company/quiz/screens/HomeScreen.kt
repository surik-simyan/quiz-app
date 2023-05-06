package org.company.quiz.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.currentOrThrow

class HomeScreen : Screen {

    @Composable
    override fun Content() {
        val navigator = LocalNavigator.currentOrThrow
        Scaffold {
            Column(
                modifier = Modifier.fillMaxSize().padding(16.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                Text(
                    "Բարի գալուստ Ծաղկած փշալարերի վիկտորինա: Պատրա՞ստ եք ստուգել ձեր գիտելիքները Գուրգեն Մահարու գլուխգործոցի մասին։ Սեղմեք ներքևում գտնվող «Սկսել» կոճակը, որպեսզի սկսեք ձեր ճանապարհորդությունը այս մտածելու տեղիք տվող գրքի էջերով: Հաջողություն!",
                    textAlign = TextAlign.Center,
                )
                Button(onClick = {
                    navigator.push(QuizScreen())
                }) {
                    Text(
                        "Սկսել",
                    )
                }
            }
        }
    }
}
