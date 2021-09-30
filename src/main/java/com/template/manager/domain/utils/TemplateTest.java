package com.template.manager.domain.utils;

public class TemplateTest {
    private static StringBuilder stringBuilder;

    public static String templateHTML(){
        stringBuilder = new StringBuilder();
        stringBuilder.append("<!doctype html>\n");
        stringBuilder.append("<html>\n");
        stringBuilder.append("\t<head>\n");
        stringBuilder.append("\t\t<title>Título do meu website</title>\n");
        stringBuilder.append("\t\t<meta charset=\"utf-8\" />\n");
        stringBuilder.append("\t\t<style>\n");
        stringBuilder.append("\t\t\t*{\n");
        stringBuilder.append("\t\t\t\tmargin:0;\n");
        stringBuilder.append("\t\t\t\tpadding:0;\n");
        stringBuilder.append("\t\t\t\tfont-family: Helvetica, sans-serif, Arial;\n");
        stringBuilder.append("\t\t\t}\n");
        stringBuilder.append("\n");
        stringBuilder.append("\t\t\thtml,body{\n");
        stringBuilder.append("\t\t\t\theight:100%;\n");
        stringBuilder.append("\t\t\t}\n");
        stringBuilder.append("\n");
        stringBuilder.append("\t\t\tform{\n");
        stringBuilder.append("\t\t\t\twidth: 96%;\n");
        stringBuilder.append("\t\t\t\tmax-width: 600px;\n");
        stringBuilder.append("\t\t\t\tmargin:30px auto; \n");
        stringBuilder.append("\t\t\t\ttext-align: center;\n");
        stringBuilder.append("\t\t\t\tcolor: rgb(105, 105, 105);\n");
        stringBuilder.append("\t\t\t}\n");
        stringBuilder.append("\n");
        stringBuilder.append("\t\t\tform fieldset{\n");
        stringBuilder.append("\t\t\t\tpadding: 20px 30px;\n");
        stringBuilder.append("\t\t\t\tborder:1px solid #ccc;\n");
        stringBuilder.append("\t\t\t}\n");
        stringBuilder.append("\n");
        stringBuilder.append("\t\t\tform legend{\n");
        stringBuilder.append("\t\t\t\ttext-align: left;\n");
        stringBuilder.append("\t\t\t\tfont-size: 17px;\n");
        stringBuilder.append("\t\t\t\tcolor:rgb(130,130,130);\n");
        stringBuilder.append("\t\t\t}\n");
        stringBuilder.append("\n");
        stringBuilder.append("\t\t\tform .style_title{\n");
        stringBuilder.append("\t\t\t\tdisplay: inline-block;\n");
        stringBuilder.append("\t\t\t\tmargin-top:30px;\n");
        stringBuilder.append("\t\t\t\twidth: 80%;\n");
        stringBuilder.append("\t\t\t\tpadding: 0px 0px;\n");
        stringBuilder.append("\t\t\t\ttext-align: left;\n");
        stringBuilder.append("\t\t\t\ttext-decoration-color: #ccc;\n");
        stringBuilder.append("\t\t\t}\n");
        stringBuilder.append("\t\t\t\n");
        stringBuilder.append("\t\t\tform .style_title label{\n");
        stringBuilder.append("\t\t\t\tdisplay: inline-block;\n");
        stringBuilder.append("\t\t\t\ttext-align: left;\n");
        stringBuilder.append("\t\t\t\tcolor: rgb(105, 105, 105);\n");
        stringBuilder.append("\t\t\t}\n");
        stringBuilder.append("\n");
        stringBuilder.append("\t\t\tform h4{\n");
        stringBuilder.append("\t\t\t\tmargin-top:20px;\n");
        stringBuilder.append("\t\t\t\tcolor: rgb(100,100,100);\n");
        stringBuilder.append("\t\t\t}\n");
        stringBuilder.append("\t\t</style>\n");
        stringBuilder.append("\t</head>\n");
        stringBuilder.append("\n");
        stringBuilder.append("\t<body>\n");
        stringBuilder.append("\n");
        stringBuilder.append("\t\t<form>\n");
        stringBuilder.append("\t\t\t<fieldset>\n");
        stringBuilder.append("\t\t\t\t<legend>Template de teste</legend>\n");
        stringBuilder.append("\t\t\t\t<div class=\"style_title\">\n");
        stringBuilder.append("\t\t\t\t\t<h4>Primeiro</h4>\n");
        stringBuilder.append("\t\t\t\t\t<br>\n");
        stringBuilder.append("\t\t\t\t\t<p>\n");
        stringBuilder.append("\t\t\t\t\t\tEsse template foi feito para testar a construção de um documento,\n");
        stringBuilder.append("\t\t\t\t\t\tpara avalidar o comportamento da aplicação na subistituição de variaveis\n");
        stringBuilder.append("\t\t\t\t\t\tcomo essas <<variavel_iniciial>>.\n");
        stringBuilder.append("\t\t\t\t\t</p>\n");
        stringBuilder.append("\t\t\t\t</div>\n");
        stringBuilder.append("\t\t\t\t<div class=\"style_title\">\n");
        stringBuilder.append("\t\t\t\t\t<h4>Dados Adicionais</h4>\n");
        stringBuilder.append("\t\t\t\t\t<br>\n");
        stringBuilder.append("\t\t\t\t\t<div>\n");
        stringBuilder.append("\t\t\t\t\t\t<div>\n");
        stringBuilder.append("\t\t\t\t\t\t\t<label>Nome:</label>\n");
        stringBuilder.append("\t\t\t\t\t\t\t<br>\n");
        stringBuilder.append("\t\t\t\t\t\t\t<label><<nome_pessoa>></label>\n");
        stringBuilder.append("\t\t\t\t\t\t</div>\n");
        stringBuilder.append("\t\t\t\t\t\t<div>\n");
        stringBuilder.append("\t\t\t\t\t\t\t<label>Email:</label>\n");
        stringBuilder.append("\t\t\t\t\t\t\t<br>\n");
        stringBuilder.append("\t\t\t\t\t\t\t<label><<email_pessoal>></label>\n");
        stringBuilder.append("\t\t\t\t\t\t</div>\n");
        stringBuilder.append("\t\t\t\t\t\t<div>\n");
        stringBuilder.append("\t\t\t\t\t\t\t<label>Cidade:</label>\n");
        stringBuilder.append("\t\t\t\t\t\t\t<br>\n");
        stringBuilder.append("\t\t\t\t\t\t\t<label><<cidade>></label>\n");
        stringBuilder.append("\t\t\t\t\t\t</div>\n");
        stringBuilder.append("\t\t\t\t\t\t<div>\n");
        stringBuilder.append("\t\t\t\t\t\t\t<label>Estado:</label>\n");
        stringBuilder.append("\t\t\t\t\t\t\t<br>\n");
        stringBuilder.append("\t\t\t\t\t\t\t<label><<estado>></label>\n");
        stringBuilder.append("\t\t\t\t\t\t</div>\n");
        stringBuilder.append("\t\t\t\t\t\t<div>\n");
        stringBuilder.append("\t\t\t\t\t\t\t<label>Data de Nascimento:</label>\n");
        stringBuilder.append("\t\t\t\t\t\t\t<br>\n");
        stringBuilder.append("\t\t\t\t\t\t\t<label><<data_nascimento>></label>\n");
        stringBuilder.append("\t\t\t\t\t\t</div>\n");
        stringBuilder.append("\t\t\t\t\t\t<div>\n");
        stringBuilder.append("\t\t\t\t\t\t\t<label>Estado Civil:</label>\n");
        stringBuilder.append("\t\t\t\t\t\t\t<br>\n");
        stringBuilder.append("\t\t\t\t\t\t\t<label><<estado_civil>></label>\n");
        stringBuilder.append("\t\t\t\t\t\t</div>\n");
        stringBuilder.append("\t\t\t\t\t\t<div>\n");
        stringBuilder.append("\t\t\t\t\t\t\t<label>Idade:</label>\n");
        stringBuilder.append("\t\t\t\t\t\t\t<br>\n");
        stringBuilder.append("\t\t\t\t\t\t\t<label><<idade>></label>\n");
        stringBuilder.append("\t\t\t\t\t\t</div>\n");
        stringBuilder.append("\t\t\t\t\t</div>\n");
        stringBuilder.append("\t\t\t\t</div>\n");
        stringBuilder.append("\t\t\t</fieldset>\n");
        stringBuilder.append("\t\t</form>\n");
        stringBuilder.append("\t</body>\n");
        stringBuilder.append("</html>");
        return stringBuilder.toString();
    }
}
