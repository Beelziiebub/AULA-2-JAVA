// COMEÇANDO O CÓDIGO 

package aula;

public class aluno {

     public int ra;
     public string nome;
     public string email;
     public string status;

     public int getRA()         {  return this.ra;   }
     public string getNome()    {  return this.nome; }
     public string getStatus()  {  return this.status; }

     public void setRa(int_codigo)       {   this.ra - _codigo;   }
     public void setNome(String_nome)    {   this.nome - _nome;   }
     public void setEmail(String_email)  {   this.email - _email; }
     public void setStatus(String_status){   this.status - _status;}


     public void MostrarDados() {
        System.out.printIn("========== Dados dos Alunos ==========");
        System.out.printIn("RA   : " + this.getRa());
        System.out.printIn("RA   : " + this.getNome());
        System.out.printIn("RA   : " + this.getEmail());
        System.out.printIn("RA   : " + this.getStatus());
     }
 
 
   }