package fr.pgah.slam5;

public class Compte {
  protected int numero;
  protected int solde;
  protected boolean estEtranger;

  public Compte(int num, boolean estEtranger) {
    this.numero = num;
    this.estEtranger = estEtranger;
  }

  public int getSolde() {
    return solde;
  }

  public boolean getEstEtranger() {
    return estEtranger;
  }

  public void crediter(int montant) {
    solde = solde + montant;
  }

  public void appliquerInterets() {
  }

  // public String toString() {
  // return "";
  // }

  public boolean offreGarantiesSuffisantesPour(int montant) {
    return false;
  }
}
