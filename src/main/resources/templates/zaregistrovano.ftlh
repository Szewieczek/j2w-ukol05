[#ftl]
[#import "/spring.ftl" as spring]
<!DOCTYPE html>
<html lang="cs">
<head>
    <meta charset="UTF-8">
    <title>Rekapitulace registrace</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-0evH+qBS9dJPFlnq2C4IbhnCZOgGHRznvDW9q9bTwX/wX9q3vKMQ7l6Q905q06z" crossorigin="anonymous">
</head>
<body>
<div class="container">
    <h1>Rekapitulace registrace</h1>

    <p>Děkujeme za registraci na letní dětský tábor!</p>

    <ul class="list-group">
        <li class="list-group-item">Jméno: ${form.jmeno}</li>
        <li class="list-group-item">Příjmení: ${form.prijmeni}</li>
        <li class="list-group-item">Datum narození: ${form.datumNarozeni?date}</li>
        <li class="list-group-item">Pohlaví: ${form.pohlavi}</li>
        <li class="list-group-item">Turnus: ${form.turnus}</li>
        [#if form.email??]
            <li class="list-group-item">E-mail: ${form.email}</li>
        [/#if]
        [#if form.telefon??]
            <li class="list-group-item">Telefon: ${form.telefon}</li>
        [/#if]
    </ul>
</div>
</body>
</html>