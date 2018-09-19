<?php

    $login=$_POST['usuario'];
    $senha=$_POST['senha'];

    if (login == "admin" && $senha == "123456") {
        session_start();
        $_SESSION['login'] = $login;
        $_SESSION['senha'] = $senha;
        header("Location: ../alunos/index.php");
    } else {
        header("Location: ../index.php");
    }



?>