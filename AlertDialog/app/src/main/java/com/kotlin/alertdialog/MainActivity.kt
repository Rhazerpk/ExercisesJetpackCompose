package com.kotlin.alertdialog

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kotlin.alertdialog.ui.theme.AlertDialogTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AlertDialogTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    AlertDialogDemo()
                }
            }
        }
    }
}

@Composable
fun AlertDialogDemo() {
    var showDialog by remember { mutableStateOf(false) }

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Button(
            onClick = { showDialog = true },
            modifier = Modifier.padding(16.dp)
        ) {
            Text(text = "Show Dialog")
        }

        if (showDialog) {
            AlertDialog(
                onDismissRequest = { showDialog = false },
                title = {
                    Text(text = "Diálogo de Alerta")
                },
                text = {
                    Text(text = "Hola a todos, esta es una advertencia para que cierren la aplicación.")
                },
                confirmButton = {
                    TextButton(
                        onClick = {
                            showDialog = false
                        }
                    ) {
                        Text(text = "Aceptar")
                    }
                },
                dismissButton = {
                    TextButton(
                        onClick = {
                            showDialog = false
                        }
                    ) {
                        Text(text = "Cancelar")
                    }
                }
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun AlertDialogDemoPreview() {
    AlertDialogTheme {
        AlertDialogDemo()
    }
}






