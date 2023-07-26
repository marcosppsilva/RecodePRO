const salario = 1200;
        
        let vendas = Number(prompt("Informe o valor de vendas do mês"))
        
        let bonus =  15 *(vendas / 100)
        let novosalario = salario + bonus
        
        alert ("Seu salário mensal é de R$ " + salario + ", Suas vendas este mês foi de R$ " + vendas +", Sua comissão de 15% este mês foi de R$" + bonus + " e seu salário bruto deste mês foi de R$ " + novosalario)
        document.write("Salário Final R$ " + novosalario)