package Questao4;

    public class NoDuplamente<E> {
        private E carga;
        private NoDuplamente<E> anterior;
        private NoDuplamente<E> proximo;

        public NoDuplamente(E carga) {
            this.carga=carga;
        }

        public E getCarga() {
            return carga;
        }

        public void setCarga(E carga) {
            this.carga = carga;
        }

        public NoDuplamente getAnterior() {
            return anterior;
        }

        public void setAnterior(NoDuplamente anterior) {
            this.anterior = anterior;
        }

        public NoDuplamente getProximo() {
            return proximo;
        }

        public void setProximo(NoDuplamente proximo) {
            this.proximo = proximo;
        }

        @Override
        public String toString() {
            return this.carga.toString();
        }
    }


