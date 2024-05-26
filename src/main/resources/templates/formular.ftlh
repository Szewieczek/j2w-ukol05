[#ftl]
[#import "/spring.ftl" as spring]
<!DOCTYPE html>
<html lang="cs">
<head>
    <meta charset="UTF-8">
    <title>Registrace na letní dětský tábor</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="icon" type="image/png" href="../images/favicon.png">
    <link rel="stylesheet" href="../css/style.css"/>
</head>
<body>
<main>
    <form action="/" method="post">
    <h1>Registrace na letní dětský tábor</h1>
        <label for="prijmeni" class="radek">Příjmení</label>
        [@spring.formInput path="form.prijmeni"/]
        <div class="error">[@spring.showErrors "<br>"/]</div>

        <label for="jmeno" class="radek">Jméno</label>
        [@spring.formInput path="form.jmeno"/]
        <div class="error">[@spring.showErrors "<br>"/]</div>

        <label for="datumNarozeni">Datum narození:</label>
        [@spring.formInput path="form.datumNarozeni" fieldType="date" /]
        <div class="error">[@spring.showErrors "<br>"/]</div>

        <div class="radek">Pohlaví</div>
        [@spring.formRadioButtons path="form.pohlavi" options={"CHLAPEC": "Chlapec", "DIVKA": "Dívka"} separator=" "/]
        <div class="error">[@spring.showErrors "<br>"/]</div>

        <label for="turnus" class="radek">Turnus</label>
        [@spring.formSingleSelect path="form.turnus" options={
        "": "",
        "TURNUS1": "5. až 11. července",
        "TURNUS2": "12. až 18. července",
        "TURNUS3": "19. až 25. července"
        } /]
        <div class="error">[@spring.showErrors "<br>"/]</div>

        <label for="email" class="radek">E-mail</label>
        [@spring.formInput path="form.email"/]
        <div class="error">[@spring.showErrors "<br>"/]</div>
        <label for="telefon" class="telefon">Telefon</label>
        [@spring.formInput path="form.telefon"/]
        <div class="error">[@spring.showErrors "<br>"/]</div>

        <div class="radek controls">
            <button type="submit">Odeslat</button>
        </div>
    </form>
</main>
</body>
</html>
