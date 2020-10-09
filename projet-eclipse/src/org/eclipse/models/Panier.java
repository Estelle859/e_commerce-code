package org.eclipse.models;

public class Panier {

		private int id;	
		private Client client;
		
		public Panier(int id, Client client) {
			super();
			this.id = id;		
			this.client = client;
		}
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}

		public Client getClient() {
			return client;
		}
		public void setClient(Client client) {
			this.client = client;
		}

		@Override
		public String toString() {
			return "Panier [id=" + id + ", client=" + client + "]";
		}
		
}
